import React, {useState} from 'react';
import axios from 'axios';
import SubmitButton from '../components/Button/SubmitButton';
import { useNavigate } from 'react-router-dom';

const LoginForm = () => {
    const navigate = useNavigate();

    const [form, setForm] = useState({
        loginId: '',
        password: ''
    })

    const handleChange = (e) => {
        const {name, value} = e.target; // name : input 태그의 name 속성 
        setForm({
            ...form,
            [name]: value 
        });
    };
    
    const handleSubmit = async (e) => {
        e.preventDefault(); // 해당 이벤트 기본 동작 막음 (페이지 이동 & 새로 고침)
        console.log("로그인 시도", form);
        
        try {
            const response = await axios.post('http://localhost:8080/user/login', form);

            // 로그인 성공 
            console.log('로그인 성공 : ', response.data);
            alert('로그인 성공');

            navigate("/home");

        } 
        catch (error) {
            // 로그인 실패 
            console.error('로그인 실패 : ', error.response?.data || error.message);
            alert('로그인 실패 : ' + (error.response?.data || '서버 오류'));
        }
    };

    return (
        <div style={{maxWidth:'400px', margin:'50px auto'}}>
            <h2>로그인</h2>

            <form onSubmit={handleSubmit}>
                <div style={{marginBottom: '15px'}}>
                    <label>아이디</label>
                    <input
                        type='text'
                        name='loginId'
                        value={form.loginId}
                        onChange={handleChange}
                        required
                        style={{width:'100%', padding: '8px'}}
                    />
                </div>
                <div style={{marginBottom: '15px'}}>
                    <label>비밀번호</label>
                    <input
                        type='password'
                        name='password'
                        value={form.password}
                        onChange={handleChange}
                        required
                        style={{width:'100%', padding: '8px'}}
                    />
                </div>
                <SubmitButton type='submit' text="로그인">
                    로그인 
                </SubmitButton>
            </form>
        </div>
    );

};
export default LoginForm;