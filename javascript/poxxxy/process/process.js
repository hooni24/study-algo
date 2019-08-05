function solution(progresses, speeds) {
    var answer = [];
    var cnt = 1;
    var prevDone = Math.ceil((100 - progresses[0])/speeds[0]);
    for(var i = 0; i < progresses.length; i++){
        var nextDone = Math.ceil((100 - progresses[i+1])/speeds[i+1]);
        if(prevDone >= nextDone){
            cnt += 1;
        } else {
            answer.push(cnt);
            cnt = 1;
            prevDone = nextDone
        }
    }

    return answer;
}