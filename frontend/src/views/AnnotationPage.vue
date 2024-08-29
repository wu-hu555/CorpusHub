<template>
    <div class="grid-container">
        <div class="navbar bg-base-100">
            <div class="flex-1">
                <a class="btn btn-ghost text-xl">CorpusHUB</a>
            </div>
            <div class="flex-none gap-2">
                <div class="form-control">
                    <input type="text" placeholder="Search" class="input input-bordered w-24 md:w-auto" />
                </div>
                <div class="dropdown dropdown-end">
                    <div tabindex="0" role="button" class="btn btn-ghost btn-circle avatar">
                        <div class="w-10 rounded-full">
                            <img alt="Tailwind CSS Navbar component"
                                src="https://img.daisyui.com/images/stock/photo-1534528741775-53994a69daeb.webp" />
                        </div>
                    </div>
                    <ul tabindex="0"
                        class="menu menu-sm dropdown-content bg-base-100 rounded-box z-[1] mt-3 w-52 p-2 shadow">
                        <li>
                            <a class="justify-between">
                                Profile
                                <span class="badge">New</span>
                            </a>
                        </li>
                        <li><a>Settings</a></li>
                        <li><a>Logout</a></li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="main-content">
            <div class="artboard sm:w-[400px] md:w-[600px] lg:w-[800px] xl:w-[1000px]">
                <div>
                    Entities:
                    <span v-for="(entity, idx) in entityList" :key="idx" @click="selectEntity(entity)">
                        <div class="btn">{{ entity }}</div>
                    </span>
                </div>

                <textarea v-model="rawText" placeholder="Please input"
                    class="textarea textarea-warning textarea-lg  w-full h-32" />




                <div class="btn btn-accent" @click="submit">submit</div>



                <div v-if="showButton" class="textarea  textarea-warning textarea-lg  w-full ">
                    <span @click="selectWordByIdx(idx)" v-for="(word, idx) in wordList" :key="idx" :data-entity="wordEntities[idx]
                    ">
                        {{ word + (idx < wordList.length - 1 ? ' ' : '' ) }} </span>

                </div>

                <div v-if="showButton">
                    <div class="btn btn-accent" @click="searchCorpora">Search
                    </div>
                </div>
            </div>
        </div>
        <footer class="footer bg-base-200 text-base-content p-10">
            <aside>
                <svg width="50" height="50" viewBox="0 0 24 24" xmlns="http://www.w3.org/2000/svg" fill-rule="evenodd"
                    clip-rule="evenodd" class="fill-current">
                    <path
                        d="M22.672 15.226l-2.432.811.841 2.515c.33 1.019-.209 2.127-1.23 2.456-1.15.325-2.148-.321-2.463-1.226l-.84-2.518-5.013 1.677.84 2.517c.391 1.203-.434 2.542-1.831 2.542-.88 0-1.601-.564-1.86-1.314l-.842-2.516-2.431.809c-1.135.328-2.145-.317-2.463-1.229-.329-1.018.211-2.127 1.231-2.456l2.432-.809-1.621-4.823-2.432.808c-1.355.384-2.558-.59-2.558-1.839 0-.817.509-1.582 1.327-1.846l2.433-.809-.842-2.515c-.33-1.02.211-2.129 1.232-2.458 1.02-.329 2.13.209 2.461 1.229l.842 2.515 5.011-1.677-.839-2.517c-.403-1.238.484-2.553 1.843-2.553.819 0 1.585.509 1.85 1.326l.841 2.517 2.431-.81c1.02-.33 2.131.211 2.461 1.229.332 1.018-.21 2.126-1.23 2.456l-2.433.809 1.622 4.823 2.433-.809c1.242-.401 2.557.484 2.557 1.838 0 .819-.51 1.583-1.328 1.847m-8.992-6.428l-5.01 1.675 1.619 4.828 5.011-1.674-1.62-4.829z">
                    </path>
                </svg>
                <p>
                    ACME Industries Ltd.
                    <br />
                    Providing reliable tech since 1992
                </p>
            </aside>
            <nav>
                <h6 class="footer-title">Services</h6>
                <a class="link link-hover">Branding</a>
                <a class="link link-hover">Design</a>
                <a class="link link-hover">Marketing</a>
                <a class="link link-hover">Advertisement</a>
            </nav>
            <nav>
                <h6 class="footer-title">Company</h6>
                <a class="link link-hover">About us</a>
                <a class="link link-hover">Contact</a>
                <a class="link link-hover">Jobs</a>
                <a class="link link-hover">Press kit</a>
            </nav>
            <nav>
                <h6 class="footer-title">Legal</h6>
                <a class="link link-hover">Terms of use</a>
                <a class="link link-hover">Privacy policy</a>
                <a class="link link-hover">Cookie policy</a>
            </nav>
        </footer>
    </div>



</template>

<script setup>
import { ref, reactive ,toRaw} from 'vue';
import { Delete, Edit, Search, Share, Upload } from '@element-plus/icons-vue'
import { useRouter } from 'vue-router';

const rawText = ref('');
const wordList = ref(rawText.value.split(' ')); // 将原始文本分割成单词数组
const entityList = reactive(['demographic', 'observation', 'condition', 'drug', 'measurement'])
const selectedTag = ref('demographic');
const showButton = ref(false);
const router = useRouter();


const selectEntity = (entity) => {
    selectedTag.value = entity;
}

const result = reactive({})

const submit = () => {
    wordList.value = rawText.value.split(' ');

    wordList.value.forEach((word, idx) => {
        result[word] = null;
    });
    showButton.value = true;
    console.log("Result:", result)
}


const wordEntities = reactive({});

const selectWordByIdx = (idx) => {
    const selection = window.getSelection();
    if (selection.rangeCount > 0&&idx !== -1 && selectedTag.value) {
        wordEntities[idx] = selectedTag.value
        
    }
    
        result[wordList.value[idx]] = selectedTag.value
    
    console.log("Result:", result)
    
};



const rawData = toRaw(result)
const jsonData = JSON.stringify(rawData)
const searchCorpora = () => {
    console.log('search$$', jsonData);
    router.push({
        name: 'searchPage',
    })

}
</script>

<style scoped>
@import url('@/style/ner.css');
</style>
