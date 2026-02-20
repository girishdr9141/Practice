#Match case 2021 python 10 Structural Pattern Matching
server_code=404
match server_code:
    case 200:
        print("OK")
    case 404:
        print("Not Found")
    case 500:
        print("Internal Server Error")
        