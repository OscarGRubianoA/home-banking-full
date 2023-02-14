const { createApp } = Vue

createApp({
    data() {
        return {
            data: [],
            transactions:[],
            id: new URLSearchParams(location.search).get('id'),
            state: "accounts",
            limit: 5,
        }
    }, created() {
        this.loadData();
    }, methods: {
        loadData () {
            axios.get("http://localhost:8080/api/transactions/")
                .then(response => {
                    this.data = response.data
                    this.transactions=this.data
                    /* this.data.transactions.sort((a, b) => a.id - b.id); */
                    console.log(this.data);
                    console.log(this.transactions);
                })
                .catch(err => console.log(err));
        },
    }
}). mount('#App')