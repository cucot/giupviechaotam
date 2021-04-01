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
            // {
            //     targets: [0, 2, 3],
            //     sortable: false,
            // },
            {
                targets: 0,
                title: 'ID',
                searchable: false,
                sortable: false,
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