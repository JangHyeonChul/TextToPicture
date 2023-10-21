<template>


  <HeaderNav></HeaderNav>

  <div class="container">

    <router-view></router-view>

  </div>




</template>

<script>
import HeaderNav from './components/HeaderNav.vue'


export default {
  name: 'App',

  components: {
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
  padding: 1rem 0;
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

a {
  text-decoration: none;
}







</style>
