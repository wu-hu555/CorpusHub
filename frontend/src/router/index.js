import { createRouter, createWebHistory } from "vue-router";
import AnnotationView from "@/views/AnnotationView.vue";

const routes = [
  {
    path: "/",
    name: "AnnotationView",
    component: AnnotationView,
  },
];

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes,
});

export default router;
