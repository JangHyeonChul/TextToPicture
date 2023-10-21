<template>


  <form class="Image-form">
    <input placeholder="텍스트를 입력해보세요. 내가 원하는 그림을 그려줍니다" class="Image-Input"/>
    <button type="button" v-on:click="ImageGenerate()" class="Image-Generate-btn">Generate</button>
  </form>

  <div class="Image-display">

    <img class="Image-context" :src="ImageGenerateUrl"/>
    <h1> {{ ImageGenerateDefaultMessage }}</h1>
  </div>

</template>

<script>
import axios from "axios";

export default {
  name: "ImageSection",

  data: () => ({
    ImageGenerateDefaultMessage: '이미지는 이곳에 표시됩니다',
    ImageGenerateUrl: '',
  }),


  // ========= METHOD BINDING
  methods: {
    ImageGenerate() {
      axios.get("http://localhost:8080/image/generate").then(res => {
        this.ImageGenerateUrl = res.data;
        this.ImageGenerateDefaultMessage = '';
        console.log(res.data);
      })

    }
  }
}
</script>

<style scoped>

.Image-Input {
  width: 100%;
  border: none;
  padding: 0.8rem 0.5rem;

}

.Image-form {
  display: flex;
  box-shadow: rgba(0, 0, 82, 0.15) 0px 2px 4px 0px;
  margin: 3rem 0;
}

.Image-Generate-btn {
  border-left: 1px solid #ececec;
}

.Image-display {
  display: flex;
  align-items: center;
  justify-content: center;
  width: 100%;
  height: 600px;
  margin: 2rem 0;
  border: dashed 1px #dcdcdc;
}

.Image-context {
}




</style>