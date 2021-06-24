FROM node:10
 
# set your working directory  
 
# add `/app/node_modules/.bin` to $PATH  
ENV PATH /app/node_modules/.bin:$PATH  

# install application dependencies  
COPY package.json ./  
 
# add app  
COPY . ./

RUN npm install 

CMD ["npm", "start"] 