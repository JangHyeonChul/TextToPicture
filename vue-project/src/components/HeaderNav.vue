<template>

  <div class="header-nav">

    <div class="header-item">

      <!-- LOGO -->
      <router-link to="/"><h1 style="font-size: 1.5rem">TEXT TO PICTURE</h1></router-link>

      <!-- HEADER ITEM -->
      <ul class="header-ul">
        <router-link to="/create"><li>CREATE</li></router-link>
        <router-link to="/lounge"><li>LOUNGE</li></router-link>
        <router-link to="/answer"><li>ANSWER</li></router-link>
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
  background: #fafafc;
  border-bottom: 1px solid rgba(0,0,0,.05);
  padding: 0.5rem 1rem;

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