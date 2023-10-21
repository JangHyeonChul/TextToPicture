<template>
<div class="answer-card">

  <form>
  <div class="title">
  <h1>오늘 나의 하루에 대해서 기록해보세요</h1>
  <h2>해당 질문에 따라서 그림을 그려줍니다</h2>
  </div>

  <div class="answer">
    <h3>Q1 오늘의 밖에 날씨는 추웠나요? 더웠나요?</h3>
    <input type="text" />
  </div>

  <div class="answer">
    <h3>Q1 오늘의 밖에 날씨는 추웠나요? 더웠나요?</h3>
    <input type="text" />
  </div>

    <div class="answer">
      <h3>Q1 오늘의 밖에 날씨는 추웠나요? 더웠나요?</h3>
      <input type="text" />
    </div>


  <div class="answer">
    <h3>Q1 오늘의 밖에 날씨는 추웠나요? 더웠나요?</h3>
    <input type="text" />
  </div>


  <div class="answer">
    <h3>Q1 오늘의 밖에 날씨는 추웠나요? 더웠나요?</h3>
    <input type="text" />
  </div>

  <div class="button-box">
    <button type="button" style="background: red" class="button">초기화</button>
    <button type="button" class="button">생성</button>
  </div>

  </form>

</div>
</template>

<script>
export default {
  name: "AppAnswer"
}
</script>

<style scoped>

.title {
  background: #fafafa;
  margin-bottom: 2rem;
  padding: 1rem 0;
  box-shadow: rgba(0, 0, 82, 0.15) 0px 1px 1px 0px;
  border-radius: 1rem;

}
h1 {
  text-align: center;
  font-size: 1.5rem;

}

h2 {
  text-align: center;
  font-size: 0.8rem;
}

input {
  width: 800px;
  height: 32px;
  font-size: 15px;
  border: 0;
  border-radius: 15px;
  outline: none;
  padding: 0.2rem 1rem;
  background-color: #fafafa;
  border: 1px solid #ececec;
}

h3 {
  font-size: 1rem;

}

.answer {
  margin-bottom: 3rem;
}

.button {
  display: inline-block;
  padding: 10px 20px;
  font-size: 16px;
  background-color: #2d95ff;
  color: #fff;
  border: none;
  border-radius: 5px;
  cursor: pointer;
  margin-right: 1rem;
}

/* 호버 효과 */
.button:hover {
  background-color: #0056b3;
}

/* 클릭 효과 */
.button:active {
  background-color: #004080;
}

.button-box {
  display: flex;
  justify-content: center;
}


</style>