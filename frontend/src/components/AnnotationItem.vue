<template>
    <div>
        <div v-for="(entity, index) in annotation.entities" :key="index" class="entity">
            <span>{{ annotation.text.substring(entity.start, entity.end) }}</span>
            <span class="label">{{ entity.label }}</span>
        </div>
    </div>
</template>

<script>
export default {
    props: {
        annotation: {
            type: Object,
            required: true,
        },
    },
};
</script>

<style>
.entity {
    display: inline-block;
    margin: 5px;
    padding: 2px 5px;
    background-color: #e0f7fa;
    border-radius: 3px;
}

.label {
    margin-left: 5px;
    color: #00796b;
    font-weight: bold;
}
</style>