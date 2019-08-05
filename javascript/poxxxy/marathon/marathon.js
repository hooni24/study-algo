function solution(participant, completion) {
    var answer = '';
    var partMap = {};
    completion.forEach(function(item){
        partMap[item] = partMap[item] ? partMap[item] + 1 : 1;
    });

    for(var i = 0; i < participant.length; i++){
        var part = participant[i];
        if(!partMap[part]){
            answer = participant[i];
            break;

        } else {
            partMap[part] -= 1;
        }

    }

    return answer;
}