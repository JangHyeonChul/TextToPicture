<template>
  <div class="container">

    <HeaderSubItem></HeaderSubItem>
    <ImageSection></ImageSection>
    <ImageExampleSection></ImageExampleSection>
  </div>
</template>

<script>
import HeaderSubItem from "@/components/HeaderSubItem.vue";
import ImageSection from "@/components/ImageSection.vue";
import ImageExampleSection from "@/components/ImageExampleSection.vue";

export default {
  name: "AppLounge",

  components: {
    HeaderSubItem,
    ImageSection,
    ImageExampleSection,

  }
}
</script>

<style scoped>

</style>