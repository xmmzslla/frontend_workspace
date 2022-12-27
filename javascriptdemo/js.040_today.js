// js.040_today.js

let dataBtnNode = document.querySelector('button');

dataBtnNode.onclick = () => {
  let pNode = document.querySelector('p');

  //   날짜는 무조건 new로 객체를 생성해야함 이터널 값 안줌
  let today = new Date();
  let year = today.getFullYear();
  let month = today.getMonth() + 1;
  let date = today.getDate();
  let hour = today.getHours();
  let minute = today.getMinutes();
  let second = today.getSeconds();

  pNode.innerText = `${year}-${month}-${date} ${hour}:${minute}:${second}`;
};

// let qrr = [1, 2, 3];
// let obj = { a: 1, b: 2 };
