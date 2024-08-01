<template>
    <el-container class="container1">
        <el-container class="container2">
            <div class="TagBorder">
                Tags:
                <span v-for="(tag, idx) in tagList" :key="idx" @click="selectTag(tag)">
                    <el-tag class="tags">{{ tag}}</el-tag>
                </span>
            </div>
            <p />
            <el-input autofocus v-model="rawText" class="textarea" :rows="5" type="textarea"
                placeholder="Please input" />
            <p />
            <el-button type="primary" :icon="Search" @click="submit" id="button1">submit</el-button>
            <p />
            <div v-if="rawText"
                style="font-family: 'Courier New', Courier, monospace; font-size: 20px; text-align: left; width: 600px; background-color: white; padding: 10px;">
                <div @click="selectWord">
                    <span v-for="(word, idx) in wordList" :key="idx" :data-entity="currentlySelected === idx ? selectedTag : null
                    ">
                        {{ word + (idx < wordList.length - 1 ? ' ' : '' ) }} </span>
                </div>
                <p />

            </div>
            <p/>
            <div v-if="showButton" class="right-align-container">
                <el-button type="primary" :icon="Search" @click="searchCorpora" id="button2">Search</el-button>
            </div>

        </el-container>



    </el-container>

</template>

<script setup>
import { ref, onMounted } from 'vue';
import { Delete, Edit, Search, Share, Upload } from '@element-plus/icons-vue'

const rawText = ref('');
const wordList = ref(rawText.value.split(' ')); // 将原始文本分割成单词数组
const currentlySelected = ref(-1); // 响应式变量，用于跟踪当前选中的单词索引
const tagList = ref(['demographic', 'observation', 'condition', 'drug', 'measurement'])
const selectedTag = ref('demographic'); 
const showButton = ref(false);


const selectTag = (tag) => {
    selectedTag.value = tag;
    console.log(selectedTag.value);
}
const submit = () =>{
    wordList.value = rawText.value.split(' ');
    showButton.value = true;
    console.log(wordList.value);
}
const selectWord = () => {
    const userSelection = window.getSelection();
    if (userSelection.rangeCount > 0) {
        const selected = userSelection.getRangeAt(0).toString().trim();
        const index = wordList.value.findIndex(w => w === selected);
        if (index !== -1) {
            currentlySelected.value = index; // 更新当前选中的单词索引
        }
    }
};

const searchCorpora =  () =>{
    console.log('search');
}

onMounted(() => {
    // 组件挂载后，无需额外操作，因为文本处理已在数据层面完成
});
</script>

<style scoped>
@import url('./ner.css');


.container1{
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
    width: 100vw;
    background-color: #f1f1f0;
  
}
.container2 {
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
    height: 100vh;
    width: 650px;
    background-color: #e4e4b7;

}

.Tagborder{
    display: inline;
    
}

.tags {
    font-size: 20px;
    background-color: purple;
    color: white;
    border: 1px solid;
    padding: 2px;
    margin: 4px;
    border-radius: 10px;
}
#button1{
    margin-left: 500px;
}
.right-align-container {
    display: flex;
    width: 600px;
    justify-content: flex-end;
}

.textarea{
    width: 600px;
    font-family: 'Courier New', Courier, monospace;
    font-size: 20px

}
</style>
