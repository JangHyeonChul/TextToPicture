<template>
  <img alt="Vue logo" src="./assets/logo.png">
  <HelloWorld msg="Welcome to Your Vue.js App"/>
  <button type="button" @click="testMethod()"> asdfasdf</button>
</template>

<script>
import HelloWorld from './components/HelloWorld.vue'

import axios from "axios"

export default {
  name: 'App',

 methods: {
        testMethod() {
            axios
            .get('http://localhost:8080/')
            .then( (response) => {
                console.log(response)
            })
            .catch((error) => {
                console.log(error);
            })
        }
    },

  components: {
    HelloWorld
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
