<template>

  <HeaderNav></HeaderNav>

  <div class="container">

    <HeaderSubItem></HeaderSubItem>
    <ImageSection></ImageSection>
    <ImageExampleSection></ImageExampleSection>

  </div>

</template>

<script>
import HeaderNav from './components/HeaderNav.vue'
import HeaderSubItem from './components/HeaderSubItem.vue'
import ImageSection from "@/components/ImageSection.vue";
import ImageExampleSection from "@/components/ImageExampleSection.vue";


export default {
  name: 'App',


  components: {
    HeaderSubItem,
    ImageExampleSection,
    ImageSection,
    HeaderNav

  }
}
</script>

<style>


html {
  font-family: 'Bebas Neue', sans-serif;

}
body {
  background: #fafafc;


}

body, html , h1 {
  margin: 0px;
  padding: 0px;


}

.container {
  width: 1380px;
  margin-left: auto;
  margin-right: auto;
}

ul li {
  list-style: none;
}

input:focus {
  outline: none;
}

button {
  background: inherit;
  border: none;
}

h1 {
  font-size: 0.8rem;

}





</style>
