let fact= "hola mundo"
if(typeof fact==="String"){
    console.log("esto es un String")
}else{
    console.log("Esto no es un String")
}

const {createApp}=Vue

createApp({
    data(){
        return{
            data:[],
            cards:[],
            transactions:[],
            loader:true
        }
    }
}
)