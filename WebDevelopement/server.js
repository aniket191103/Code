
const http = require('http');
const url = require('url');

// Create a simple server
const server = http.createServer((req, res) => {
  // Parse the request URL
  const parsedUrl = url.parse(req.url, true);

  // Handle different routes
  if (parsedUrl.pathname === '/') {
    // Handle requests to the root path
    res.writeHead(200, { 'Content-Type': 'text/plain' });
    res.end('Hello, this is a simple web server!');
  } else if (parsedUrl.pathname === '/api') {
    // Handle requests to the /api endpoint
    res.writeHead(200, { 'Content-Type': 'application/json' });
    res.end(JSON.stringify({ message: 'This is the API endpoint' }));
  } else {
    // Handle other routes with a 404 Not Found response
    res.writeHead(404, { 'Content-Type': 'text/plain' });
    res.end('404 Not Found');
  }
});

// Specify the port to listen on
const port = 3000;

// Start the server and listen on the specified port
server.listen(port, () => {
  console.log(`Server is running at http://localhost:${port}`);
});
