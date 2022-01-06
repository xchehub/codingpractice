
def isAnagram(s: str, t: str) -> bool:
    from collections import Counter
    return Counter(s) == Counter(t)

def isAnagramV2(s: str, t: str) -> bool:
    if len(s) != len(t): return False
    count = {}
    for c in s:
        count[c] = count.get(c, 0) + 1

    for c in t:
        if c not in count or count[c] == 0:
            return False
        else:
            count[c] -= 1

if __name__ == '__main__':
    print(isAnagram("anagram", "nagaram"))
    print(isAnagram("car", "rat"))
    print(isAnagramV2("anagram", "nagaram"))
    print(isAnagramV2("car", "rat"))
