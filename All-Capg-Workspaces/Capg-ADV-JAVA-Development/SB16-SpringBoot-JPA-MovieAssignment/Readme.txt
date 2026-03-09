portno 9999

add movie
@PostMapping("/add")
http://Localhost:9998/movie/add
[{
	"movieId": 1,
    "movieName": "The Shawshank Redemption",
    "movieGenre": "Drama",
    "movieRating": 9.3
}

{
	"movieId": 2,
    "movieName": "The Godfather",
    "movieGenre": "Crime",
    "movieRating": 9.2
}

{
    "movieId": 3,
    "movieName": "The Dark Knight",
    "movieGenre": "Action",
    "movieRating": 9.0
}

{
	    "movieId": 4,
    "movieName": "Pulp Fiction",
    "movieGenre": "Crime",
    "movieRating": 8.9
}

{
    "movieId": 5,
    "movieName": "The Lord of the Rings: The Return of the King",
    "movieGenre": "Fantasy",
    "movieRating": 8.9}

]

update movie
@PutMapping("/update")
http://Localhost:9998/movie/update
{

    "movieId": 1,
    "movieName": "The Shawshank Redemption",
    "movieGenre": "Drama",
    "movieRating": 9.4
    }

get all movies
@GetMapping("/getall")
http://Localhost:9998/movie/getall

delete movie by id
@DeleteMapping("/delete/{id}")
http://Localhost:9998/movie/delete/1

get movies by rating
@GetMapping("/getbyrating/{rating}")
http://Localhost:9998/movie/getbyrating/9.0
