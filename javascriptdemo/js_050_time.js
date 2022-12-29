//  js_050_time.js

function display() {
  for (let i = 0; i <= 5; i++) {
    console.log(i);
  }
}

console.log('start');
//1000이 1초
// setTimeout(실행함수, 시간)
setTimeout(display, 1000); //한번만 수행
// clearTimeout(display);

// setInterval(display, 1000); //반복 수행
// clearInterval(display);
console.log('end');
