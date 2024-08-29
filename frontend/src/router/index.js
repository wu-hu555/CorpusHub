import { createRouter, createWebHistory } from "vue-router";
import AnnotationPage from "@/views/AnnotationPage.vue";
import Annotation from "@/views/Annotation.vue";
import SearchPage from "@/views/SearchPage.vue";
import LoginPage from "@/views/LoginPage.vue";
import component from "element-plus/es/components/tree-select/src/tree-select-option.mjs";

const routes = [
  {
    path: "/login",
    name: "LoginPage",
    component: LoginPage,
  },
  // {
  //   path: "/annotation",
  //   name: "AnnotationPage",
  //   component: AnnotationPage,
  // },
  {
    path: "/annotation",
    name: "Annotation",
    component: AnnotationPage,
  },
  {
    path: "/search",
    name: "searchPage",
    component: SearchPage,
  },
  {
    path: "/",
    redirect: "/login",
  },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});

export default router;
