**Команды которые я ввел:<br>
``
docker build -t javadoc .
docker run -dit javadoc    
``<br>
**Дальше здесь мне нужно было, забрать javadoc, теперь он лежит в sourceMyContainer/docs<br>
``PS C:\Users\see1\Desktop\HomeworkJava-main> docker ps<br>
CONTAINER ID   IMAGE          COMMAND                  CREATED          STATUS          PORTS     NAMES<br>
2ed052fa3dcf   javadoc        "/bin/sh -c 'java -c…"   17 seconds ago   Up 15 seconds             competent_meitner<br>
965fd83837dd   8ce0025309e6   "/bin/sh -c 'java -c…"   6 minutes ago    Up 6 minutes              cranky_shannon<br>
7ee783b927a4   697e8f45991c   "/bin/sh"                23 minutes ago   Up 23 minutes             condescending_buck<br>
PS C:\Users\see1\Desktop\HomeworkJava-main> docker cp 2ed052fa3dcf:/sourceMyContainer ./<br>
``
