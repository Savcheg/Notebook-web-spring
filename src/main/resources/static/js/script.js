
function getNotes() {
    axios.get('/api/notes')
        .then(function (response) {
            document.getElementById('notes').innerHTML = response.data.map(function (note) {
                return (
                    '<li class="row">' +
                    '<div class="col-md-3">' +
                    '<strong>' + note.title + '</strong>' +
                    '<div>Description:' + note.description + '</div>' +
                    '<div>Type:' + note.type + '</div>' +
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