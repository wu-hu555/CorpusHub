import { defineStore } from "pinia";

export const useAnnotationStore = defineStore("annotation", {
  state: () => ({
    annotations: [],
  }),
  actions: {
    loadAnnotations() {
      // Load your annotations from a server or local file
      // For example:
      this.annotations = [
        {
          text: "Erich Dengler, the son of Manferd Dengler, poses as an Art Collector...",
          entities: [
            { start: 0, end: 12, label: "PERSON" },
            { start: 27, end: 41, label: "PERSON" },
            // More entities...
          ],
        },
        // More annotations...
      ];
    },
  },
});
