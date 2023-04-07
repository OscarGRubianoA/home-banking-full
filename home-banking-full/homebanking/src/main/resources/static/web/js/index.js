function displayTime() {
    var currentTime = new Date();
    var hours = currentTime.getHours();
    var minutes = currentTime.getMinutes();
    var seconds = currentTime.getSeconds();
    var clock = hours + ":" + minutes + ":" + seconds;
    document.getElementById("clock").innerHTML = clock;
  }
  setInterval(displayTime, 1000);
  const {createApp} = Vue
  createApp({
    data(){
      return{

      }
    }
  })
  