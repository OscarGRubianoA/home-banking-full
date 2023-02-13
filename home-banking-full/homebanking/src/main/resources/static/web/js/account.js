const { createApp } = Vue;

createApp({
    data() {
        return {
            data: [],
            state: "accounts",
            limit: 5,
        }
    }, created() {
        this.loadData();
    }, methods: {
        loadData: function () {
            axios.get("http://localhost:8080/api/clients/1")
                .then(response => {
                    this.data = response.data;
                    this.data.accounts.sort((a, b) => a.id - b.id);
                    console.log(this.data);
                })
                .catch(err => console.log(err));
        },
    }
}), mount('app');