const app = new Vue({
    el: 'div#app',
    data: {
        companyName: 'Hao Tam',
        role: 'Giup viec',
    	homepage_link: 'https://giupviechaotam.com',
		laodong_link: 'https://giupviechaotam.com/nguoi-giup-viec/',
		chunha_link: 'https://giupviechaotam.com/chu-nha/',
        heading: 'Welcome to quan ly lao dongg',
        content: 'Hello, Vue!',
        description: 'This is the very first day with Vue.js'
    },
    computed: {
        fullTitle() {
            return this.role + " " + this.companyName;
        }
    }
});