<template>
  <button type="button" @click="testMethod()"> asdfasdf</button>
  <h1>안녕하세요test</h1>
  <h2>서승호입니다</h2>
  <input type="text" />
  <button type="button">제출버튼 </button>
  <h1>기능1완성</h1>

</template>

<script>

import axios from "axios"

export default {
  name: 'App',

 methods: {
   testMethod() {
            axios.get('http://localhost:8080/test')
            .then( (response) => {
                console.log(response)
            })
            .catch((error) => {
                console.log(error);
            })
        }
    },

  components: {

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
