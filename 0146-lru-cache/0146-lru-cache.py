class LRUCache:

    def __init__(self, capacity: int):
        self.capacity = capacity
        self.s = {}
        self.lru = [] # populate with keys

    def get(self, key: int) -> int:
        if key in self.lru:
            self.lru.append(self.lru.pop(self.lru.index(key)))
            return self.s[key]
        return -1

    def put(self, key: int, value: int) -> None:
        if key in self.s.keys():
            self.s[key] = value
            self.lru.append(self.lru.pop(self.lru.index(key)))
        else:
            if (len(self.lru) >= self.capacity):
                lru_key = self.lru[0]
                self.lru = self.lru[1:]
                del(self.s[lru_key])
            self.s[key] = value
            self.lru.append(key)
# Your LRUCache object will be instantiated and called as such:
# obj = LRUCache(capacity)
# param_1 = obj.get(key)
# obj.put(key,value)