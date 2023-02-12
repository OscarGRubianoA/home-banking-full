const {createApp}=Vue

createApp({
    data(){
        return{
            dates:null,
            url:"http://localhost:8080/api/clients/",
            firstClient:"",
            lastNameClient:"",
            emailClient:"",
            numberAccount:"",
            accountsClient:[]

        }
    },created(){
        this.loadData()
    },methods:{

        loadData(){
            axios.get("http://localhost:8080/api/clients/")
            .then((response)=>{
                console.log(response)
                this.dates=response;
                this.firstClient=this.dates[0].firstName;
                console.log(this.firstlient)
                this.lastNameClient=this.dates[0].lastName;
                this.emailClient=this.dates[0].email;
                this.accountsClient=this.dates[0].account;

            })
            
        },methods : 
        {
            displayTime() {
            var currentTime = new Date();
            var hours = currentTime.getHours();
            var minutes = currentTime.getMinutes();
            document.getElementById("clock").innerHTML = hours + ":" + minutes;
         }
         
    
        } 
    }
    ,//Ejecuto las funciones para mostrar los datos en las tablas correspondientes en el html
  mounted() {
    setInterval(displayTime, 1000);
  }
}).mount('#App')