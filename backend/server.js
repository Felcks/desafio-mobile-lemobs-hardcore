var express = require("express");
var app = express();

app.listen(3000, () => {
    console.log("Server running on port 30000");
})

app.get("/books", (req, res, next) => {
    res.json(
      require('../products.json')
    )
})

app.get("/", (req, res, next) => {
  res.send(
    `
                <html>
                    <head>
                        <meta charset="utf-8">
                    </head>
                    <body>
                        <h1>404 - THE PAGE CAN'T BE FOUND</h1>
                    </body>
                </html>
            `
  )
})