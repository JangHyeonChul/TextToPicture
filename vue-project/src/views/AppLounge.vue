<template>
  <div class="container">

    <section class="card">
      <div class="card-image">
      <img src="http://localhost:8080/img/20162929.jpg"/>
      </div>

      <div class="card-text">
      <h1>우주에 있는 항공복을 입은 여자</h1>


      </div>


      <div class="card-option">
        <h2>다운로드</h2>
      </div>

    </section>

    <section class="card">
      <div class="card-image">
        <img src="http://localhost:8080/img/20162929.jpg"/>
      </div>

      <div class="card-text">
        <h1>우주에 있는 항공복을 입은 여자</h1>


      </div>


      <div class="card-option">
        <h2>다운로드</h2>
      </div>

    </section>

    <section class="card">
      <div class="card-image">
        <img src="http://localhost:8080/img/20162929.jpg"/>
      </div>

      <div class="card-text">
        <h1>우주에 있는 항공복을 입은 여자</h1>


      </div>


      <div class="card-option">
        <h2>다운로드</h2>
      </div>

    </section>

    <section class="card">
      <div class="card-image">
        <img src="http://localhost:8080/img/20162929.jpg"/>
      </div>

      <div class="card-text">
        <h1>우주에 있는 항공복을 입은 여자</h1>


      </div>


      <div class="card-option">
        <h2>다운로드</h2>
      </div>

    </section>

    <section class="card">
      <div class="card-image">
        <img src="http://localhost:8080/img/20162929.jpg"/>
      </div>

      <div class="card-text">
        <h1>우주에 있는 항공복을 입은 여자</h1>


      </div>


      <div class="card-option">
        <h2>다운로드</h2>
      </div>

    </section>



  </div>
</template>

<script>
export default {
  name: "AppLounge"
}
</script>

<style scoped>
.card {
  width: 100%;
  height: 200px;
  padding: 1rem;
  margin-bottom: 1rem;
  border: solid 1px #eeeeee;
  background: #fafafa;
  box-shadow: rgba(0, 0, 82, 0.15) 0px 2px 2px 0px;
  display: flex;
  align-items: center;

}

.card-image {
  height: 200px;
  width: 350px;

}

.card-text {
  display: flex;
  justify-content: center;
  flex-direction: column;
  height: 100%;
  width: 70%;
  padding: 0 1rem;
}

.card-option {
  display: flex;
  align-items: end;
  justify-content: end;
  height: 100%;
  width: 10%;
}

img {
  width: 100%;
  height: 100%;
}

h1 {
  font-size: 1rem;
}

h2 {
  color: #afafaf;
  font-size: 0.8rem;
}



</style>