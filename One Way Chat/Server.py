import socket
HOST='127.0.0.1'
PORT=6545
s=socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.bind((HOST,PORT))
s.listen(5)
conn,addr = s.accept()
print('Connected By',addr)
while True:
    data = conn.recv(1024)
    print(str(data))
