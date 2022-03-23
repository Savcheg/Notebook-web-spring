function getNotes() {
    axios.get('/api/notes')
        .then(function (response) {
            document.getElementById('notes').innerHTML = response.data.map(function (note) {
                return (
                    '<li class="row">' +
                    '<div class="col-md-3">' +
                    '<strong>' + note.title + '</strong>' +
                    '<div>Description: ' + note.description + '</div>' +
                    '<div>Type: ' + note.type + '</div>' +
                    '</div>' +
                    '</li><br/>'
                );
            }).join('');

            console.log('worked');
        })
        .catch(function (err) {
            document.getElementById('notes').innerHTML = '<li class="text-danger">' + err.message + '</li>';
        });
}

function postNote() {
    const title = document.getElementById('inputTitle').value;
    const description = document.getElementById('inputDescription').value;
    const type = document.getElementById('inputType').value;
    const data = new Map();

    data.set("title", title);
    data.set("description", description);
    data.set("type", type);

    const obj = Object.fromEntries(data);

    axios.post('/api/notes/new', obj)
        .then(function (response) {
            window.location.replace("/notes");
        })
        .catch(function (error) {
            console.log(JSON.stringify(obj));
            console.log(error);
        });

}