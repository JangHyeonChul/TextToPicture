<template>

  <div class="main">

    <h1 class="category">카테고리</h1>

    <form class="category-form">

      <div class="option-container">
      <div class="theme">
      <h1>테마</h1>
      </div>

    <div class="checkbox-container">
      <input type="checkbox" id="theme-01">
      <label for="theme-01">바다</label>
    </div>



      <div class="checkbox-container">
        <input type="checkbox" id="theme-02">
        <label for="theme-02">숲</label>
      </div>



      <div class="checkbox-container">
        <input type="checkbox" id="theme-03">
        <label for="theme-03">평야</label>
      </div>



      <div class="checkbox-container">
        <input type="checkbox" id="theme-04">
        <label for="theme-04">동굴</label>
      </div>

        <div class="checkbox-container">
          <input type="checkbox" id="theme-05">
          <label for="theme-05">절벽</label>
        </div>

      </div>

      <div class="option-container">
        <div class="theme">
          <h1>시간</h1>
        </div>

        <div class="checkbox-container">
          <input type="checkbox" id="time-01">
          <label for="time-01">밤</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="time-02">
          <label for="time-02">낮</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="time-03">
          <label for="time-03">저녁</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="time-04">
          <label for="time-04">새벽</label>
        </div>



      </div>

      <div class="option-container">
        <div class="theme">
          <h1>기분</h1>
        </div>

        <div class="checkbox-container">
          <input type="checkbox" id="feel-01">
          <label for="feel-01">공포</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="feel-02">
          <label for="feel-02">행복</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="feel-03">
          <label for="feel-03">쌀쌀함</label>
        </div>



        <div class="checkbox-container">
          <input type="checkbox" id="feel-04">
          <label for="feel-04">슬픔</label>
        </div>

        <div class="checkbox-container">
          <input type="checkbox" id="feel-05">
          <label for="feel-05">사랑</label>
        </div>

        <div class="checkbox-container">
          <input type="checkbox" id="feel-06">
          <label for="feel-06">우울</label>
        </div>
      </div>

    </form>

    </div>

</template>

<script>
export default {
  name: "HeaderSubItem",

  methods: {

  }
}
</script>

<style scoped>
.main {
  width: 100%;
  border-bottom: solid 2px #eeeeee;
}


.checkbox-container {
  display: flex;
  align-items: center;
  margin-right: 0.8rem;

}

.checkbox-container input[type="checkbox"] {
  display: none; /* 기본 체크박스 숨김 */
}

.checkbox-container label {
  padding: 5px 10px;
  border: 1px solid #ccc;
  border-radius: 5px;
  background-color: #fff;
  font-size: 0.8rem;
  transition: background-color 0.3s ease;
}

.checkbox-container input[type="checkbox"]:checked + label {
  background-color: #aef1af; /* 체크됐을 때 배경색 변경 */
}

.theme {
  display: flex;
  align-items: center;
  padding: 0 1rem;
  border-right: 1px solid #cecece;
  margin-right: 1rem;

}

.option-container {
  display: flex;
  margin-bottom: 1rem;
}

.category {
  margin-bottom: 1.5rem;
  font-size: 1.2rem;

}

</style>