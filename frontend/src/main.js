// import { createApp } from "vue";
// import "./style.css";
// import App from "./App.vue";
// import ElementPlus from "element-plus";

// const app = createApp(App);

// app.use(ElementPlus);
// app.mount("#app");
import { createApp } from "vue";
import App from "./App.vue";
import { createPinia } from "pinia";
import router from "./router";
import ElementPlus from "element-plus";
import "./style/tailwind.css";
import "./style/globle-style.css"

//import "element-plus/lib/theme-chalk/index.css";

const pinia = createPinia();
const app = createApp(App);

app.use(pinia);
app.use(router);
app.use(ElementPlus);
app.mount("#app");
