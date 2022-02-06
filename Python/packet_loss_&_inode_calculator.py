import math

'''
Shows you the expected number of total packets needed to be transmitted before you
receive all ACK's.

num_packets: number of packets you plan on sending

loss_percentage: the percentage of packets you have lost in the past.
'''
def calculate_packet_loss(num_packets, loss_percentage):
    total_lost = 0
    while num_packets != 0:
        total_lost += math.floor(num_packets / loss_percentage)
        num_packets = math.floor(num_packets / loss_percentage)
    print(total_lost)




#File system calculations
#Give the block and index size parameters to find how many index blocks you need to store a file of size N
idx_blk_size = int(input('index block size?'))
data_blk_size = int(input('data block size?'))
ptr_size = int(input('pointer size?'))

dir_d_blocks = int(input('how many direct data blocks?'))
single_i_blocks = int(input('number of single indirect index blocks?'))
double_i_blocks = int(input('how many double indirect index blocks?'))

idx_blk_cap = idx_blk_size / ptr_size

size_for_idx = int(input('how much data (N), in bytes would you like to store?'))
total_idx_blocks = 0

while size_for_idx > 0:
    while dir_d_blocks > 0:
        size_for_idx -= (data_blk_size)
        total_idx_blocks += 1
        dir_d_blocks -= 1
    while size_for_idx > 0:
        size_for_idx -= (data_blk_size * idx_blk_cap)
        total_idx_blocks += 1
print('index blocks needed to store data file is: ' + str(total_idx_blocks))