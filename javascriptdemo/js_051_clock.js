//  js_051_clock.js

function setText(selector, text) {
  let targetElement = document.querySelector(selector);
  targetElement.innerText = text;
}

let watchTime = () => {
  const present = new Date();
  const dayList = ['일', '월', '화', '수', '목', '금', '토'];

  const hour = present.getHours();
  const minute = present.getMinutes();
  const seconds = present.getSeconds();
  console.log(`${hour} : ${minute} : ${seconds}`);

  setText('#hours', hour);
  setText('#minute', minute);
  setText('#seconds', seconds);

  const year = present.getFullYear();
  const month = present.getMonth() + 1;
  const date = present.getDate();
  const day = present.getDay(); //숫자값이 출력
  console.log(`${year}-${month}-${date}`);

  setText('#year', year);
  setText('#month', month);
  setText('#date', date);
  setText('#date', dayList[day]);
};

watchTime();

let clockInterval = setInterval(watchTime, 1000);
