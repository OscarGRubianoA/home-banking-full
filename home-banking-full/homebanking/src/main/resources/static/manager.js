const { createApp } = Vue

createApp  ({
    data() {
        return {
            clients: [],
            datos:[],
            firstName: '',
            lastName: '',
            email: '',
            alerta: false,
        }
    },
    created() {
        this.loadData();
        console.log(this.clients)
    },
    methods: {
        loadData() {
            axios.get("http://localhost:8080/clients")
                .then(response => {
                    this.datos = response
                    this.clients = response.data._embedded.clients
                    console.log(this.clients)
                })
        },
        addClient(e) {
        e.preventDefault()
            let nuevoUsuario = {
                firstName: this.firstName,
                lastName: this.lastName,
                email: this.email.toLowerCase()

            };
            console.log(nuevoUsuario)
            if (this.firstName == "" || this.lastName == "" || this.email == "") {

                this.alerta = true
            }
            else {
                this.postClient(nuevoUsuario)


                this.alerta = false
            }
        },
        postClient(obj) {
            axios.post("http://localhost:8080/clients",obj)
                .then(res=>{this.loadData()
                this.limpiarCampos()
                })
        },
        limpiarCampos(){
        this.firstName = "" ;
         this.lastName == "";
         this.email == "";
        }
    },
    computed: {

    },

}).mount('#App')