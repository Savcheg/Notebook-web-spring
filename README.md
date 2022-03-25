# Notebook-web-spring

## About the project

### API

"/api/notes"

GET Requests:

* "/" - get JSON array with all notes
* "/{id}" - get JSON object of note with inserted id

POST Requests:

* "new" - get JSON body with note entity, like:
```json
{
    "title": "TEST NOTE",
    "type": "note",
    "description": "Some text about some notes"
}
```

DELETE Requests:

* "/delete/{id}" - delete note with inserted id

### Views

"/notes"

* "" - view of all notes and button to redirect on note creation
* "/new" - note creation form with submit and redirect button
