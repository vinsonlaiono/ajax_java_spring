// AJAX calls on page load
$(document).ready(() => {
    $.ajax({
        url:"/api/users",
        method: "GET",
    })
        .done( (res) => {
            console.log(res);
            let myString = "";
            for(let i=0; i< res.length; i++){
                myString += `<p>${res[i].email} : ${res[i].password}</p>`;
            }
            $('#users').html(myString);
        })

})