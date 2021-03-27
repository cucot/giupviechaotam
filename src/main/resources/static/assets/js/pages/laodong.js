// const app = new Vue({
//     el: 'div#app',
//     data: {
//         companyName: 'Hao Tam',
//         role: 'Giup viec',
//     	homepage_link: 'https://giupviechaotam.com',
// 		laodong_link: 'https://giupviechaotam.com/nguoi-giup-viec/',
// 		chunha_link: 'https://giupviechaotam.com/chu-nha/',
//         heading: 'Welcome to quan ly lao dongg',
//         content: 'Hello, Vue!',
//         description: 'This is the very first day with Vue.js'
//     },
//     computed: {
//         fullTitle() {
//             return this.role + " " + this.companyName;
//         }
//     }
// });

$(document).ready(function() {
    const dataTable = $('#tblLaoDong').dataTable({
        serverSide: true,
        ajax: {
            url: '/api/employees',
            type: 'GET',
            length: 10,
            start: 0,
        },
        columns: [
            {data: 'id'},
            {data: null},// name
            {data: 'phoneNumber'},
            {data: 'identityNumber'},           
        ],
        columnDefs: [
            {
                targets: [0, 2, 3],
                sortable: false,
            },
            {
                targets: 0,
                title: 'ID',
                searchable: false,
                width: '10%',
                render: function(data) {
                    return data;
                }
            },
            {
                targets: 1,
                title: 'Tên lao động',
                width: '30%',
                render: function(data, type, row) {
                    return row.lastName + ' ' + row.firstName;
                }
            },
            {
                targets: 2,
                title: 'Số điện thoại',
                width: '30%',
                render: function(data) {
                    return data;
                }
            },
            {
                targets: 3,
                title: 'Số CCCD',
                searchable: false,
                width: '30%',
                render: function(data) {
                    return data;
                }
            },
        ]

    })
})