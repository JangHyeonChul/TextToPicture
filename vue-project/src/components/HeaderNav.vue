<template>

  <div class="header-nav">

    <div class="header-item">

      <!-- LOGO -->
      <h1 style="font-size: 1.5rem">TEXT TO PICTURE</h1>

      <!-- HEADER ITEM -->
      <ul class="header-ul">
        <li>ROUNGE</li>
        <li>HISTORY</li>
        <li>ANSWER</li>
      </ul>
    </div>

  </div>
</template>

<script>
export default {
  name: "HeaderNav"
}
</script>

<style scoped>
.header-nav, .header-item, .header-ul {
  display: flex;
  align-items: center;
}

.header-nav {
  margin: 0;
  padding: 0;
  background: #fafafc;
  width: 100%;
  border-bottom: 1px solid rgba(0,0,0,.05);
  padding: 0.5rem 1rem;

}

.header-item {

}

.header-ul li {
  font-family: 'Bebas Neue', sans-serif;
  font-weight: bold;
  color: #afafaf;
  margin-right: 1rem;
}



h1 {
  font-size: 1.2rem;
}
</style>