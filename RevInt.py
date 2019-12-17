#top leetcode submission based on runtime and memory usage
class Solution:
    def reverse(self, x: int) -> int:
        lenny=len(str(x))-1
        rev=0
        if x not in range((-2**31),((2**31)-1)):
            return 0
        else:
            for taker in [x]:
                #for negative #
                if taker <=0:
                    #turn neg into positive
                    lenny=len(str(x))-2
                    taker=taker+abs(taker*2)
                    while taker !=0:  
                        #add new value to rev so (123 % 10)=3 and 3*(10^0)=3
                        rev -=(taker % 10)*(10**lenny)
                        lenny-=1
                        #new taker
                        taker=taker//10
                else:
                    while taker !=0:
                        rev +=(taker % 10)*(10**lenny)
                        lenny-=1
                        taker=taker//10
            now=rev
            if now in range((-2**31),((2**31)-1)):
                return rev
            else:
                return 0
                        
                        
