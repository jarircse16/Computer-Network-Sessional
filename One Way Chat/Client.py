import socket
HOST = '127.0.0.1'
PORT = 6545
s=socket.socket(socket.AF_INET,socket.SOCK_STREAM)
s.connect((HOST,PORT))
while True:
	inp=raw_input()
	s.sendall(inp.encode('utf-8'))
	#data = s.recv(1024)
	

