function useState(val) {
    const state = {
        value: val,
        setValue: function (newValue) {
            state.value = newValue;
        }
    };
    return [state.value, state.setValue.bind(state)];
}

const [name, setName] = useState('John');

console.log(name);

setName("Alan");

console.log(name);
