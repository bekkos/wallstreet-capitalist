function onFormSubmit() {
    const url = "";
    const username = document.getElementById('username').value;
    const password = document.getElementById('password').value;
    const data = {
        username: username,
        password: password
    }
    $.post(url, data, function(result){

    });
}
