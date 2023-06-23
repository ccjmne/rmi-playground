# Build Docker image
docker build -t rmi-server .

# Run Docker image
docker run -p 1099:1099 rmi-server 
