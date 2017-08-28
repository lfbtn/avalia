<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>

<div class="content-wrapper">
	<!-- Content Header (Page header) -->
	<section class="content-header">
	<h1>
		Avaliação <small>Cadastro de Avaliação</small>
	</h1>
	<ol class="breadcrumb">
		<li><a href="#"><i class="fa fa-dashboard"></i> Avaliação</a></li>
		<li class="active">Cadastro de Avaliação</li>
	</ol>
	</section>
	<!-- Main content -->
	<section class="content">
	<div class="row">
		<div class="col-md-6">
			<!-- general form elements -->
			<!-- form start -->

			<div class="box box-primary">
				<div class="box-header with-border">
					<h3 class="box-title">Cadastro de Avaliação</h3>
				</div>
				<!-- /.box-header -->
				<form role="form" method="POST">
					<div class="box-body">
						<div class="form-group col-xs-12">
							<label for="nome">Nome</label> <input type="text"
								class="form-control" name="nome" id="nome"
								placeholder="Nome do Fornecedor " required>
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">CNPJ</label> <input type="text"
								class="form-control" name="idLegal" id="idLegal"
								placeholder="CNPJ" required>
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">Inscrição Estadual</label> <input type="text"
								class="form-control" name="inscricaoEstadual"
								id="inscricaoEstadual" placeholder="Inscrição Estadual">
						</div>

						<div class="form-group col-xs-6">
							<label for="nome">Nome Fantasia</label> <input type="text"
								class="form-control" name="nomeFantasia" id="nomeFantasia"
								placeholder="Nome Fantasia " required>
						</div>

						<div class="form-group col-xs-12">
							<label for="nome">Razão Social</label> <input type="text"
								class="form-control" name="razaoSocial" id="razaoSocial"
								placeholder="Razão Social" required>
						</div>

						<div class="form-group col-xs-10">
							<label for="nome">Descrição</label> <input type="text"
								class="form-control" name="descricao" id="descricao"
								placeholder="Descrição" required>
						</div>

						<div class="form-group col-xs-2">
							<label>Avaliação</label> <select class="form-control"
								id="avaliacaoFornecedor" name="avaliacaoFornecedor">
								<option value=-1><c:out value="N/A"></c:out>
								<option value=10><c:out value="10"></c:out>
								<option value=9><c:out value="9"></c:out>
								<option value=8><c:out value="8"></c:out>
								<option value=7><c:out value="7"></c:out>
								<option value=6><c:out value="6"></c:out>
								<option value=5><c:out value="5"></c:out>
								<option value=4><c:out value="4"></c:out>
								<option value=3><c:out value="3"></c:out>
								<option value=2><c:out value="2"></c:out>
								<option value=1><c:out value="1"></c:out>
								<option value=0><c:out value="0"></c:out>
							</select>
						</div>


						<div class="form-group col-xs-5">
							<label for="nome">E-mail</label> <input type="text"
								class="form-control" name="email" id="email"
								placeholder="e-mail@e-mail.com">
						</div>

						<div class="form-group col-xs-4">
							<label for="nome">Data de Ingresso<small>(mm/dd/aaaa)</small></label>
							<input type="date" name="datadeIngresso" class="form-control"
								value="${hoje}" />
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">Fone</label> <input type="text"
								class="form-control" name="fone" id="fone" placeholder="Fone"
								required>
						</div>

						<div class="form-group col-xs-6">
							<label for="logradouro">Nome do Vendedor</label> <input
								type="text" class="form-control" name="nomeVendedor" id=""
								nomeVendedor""
								placeholder="Nome do Vendedor">
						</div>


						<div class="form-group col-xs-3">
							<label for="logradouro">E-mail Vendedor</label> <input
								type="text" class="form-control" name="emailVendedor"
								id="emailVendedor" placeholder="E-mail Vendedor">
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">Fone de Contato Vendedor</label> <input
								type="text" class="form-control" name="foneVendedor"
								id="foneVendedor" placeholder="Fone Vendedor">
						</div>

						<div class="form-group col-xs-3">
							<label>Tipo </label> <select class="form-control" id="uf"
								name="uf">
								<option value="Rua"><c:out value="Rua"></c:out>
								<option value="Logradouro"><c:out value="Logradouro"></c:out>
								<option value="Travessa"><c:out value="Travessa"></c:out>
								<option value="Avenida"><c:out value="Avenida"></c:out>
							</select>
						</div>

						<div class="form-group col-xs-6">
							<label for="logradouro">Logradouro</label> <input type="text"
								class="form-control" name="logradouro" id="logradouro"
								placeholder="Logradouro">
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">Bairro</label> <input type="text"
								class="form-control" name="bairro" id="bairro"
								placeholder="Bairro">
						</div>

						<div class="form-group col-xs-6">
							<label for="nome">Cidade</label> <input type="text"
								class="form-control" name="cidade" id="cidade"
								placeholder="Cidade">
						</div>

						<div class="form-group col-xs-3">
							<label>UF </label> <select class="form-control" id="uf" name="uf">
								<option value="AC"><c:out value="AC"></c:out>
								<option value="AL"><c:out value="AL"></c:out>
								<option value="AM"><c:out value="AM"></c:out>
								<option value="AP"><c:out value="AP"></c:out>
								<option value="BA"><c:out value="BA"></c:out>
								<option value="CE"><c:out value="CE"></c:out>
								<option value="DF"><c:out value="DF"></c:out>
								<option value="ES"><c:out value="ES"></c:out>
								<option value="GO"><c:out value="GO"></c:out>
								<option value="MA"><c:out value="MA"></c:out>
								<option value="MG"><c:out value="MG"></c:out>
								<option value="MS"><c:out value="MS"></c:out>
								<option value="MT"><c:out value="MT"></c:out>
								<option value="PA"><c:out value="PA"></c:out>
								<option value="PB"><c:out value="PB"></c:out>
								<option value="PE"><c:out value="PE"></c:out>
								<option value="PI"><c:out value="PI"></c:out>
								<option value="PR"><c:out value="PR"></c:out>
								<option value="RJ"><c:out value="RJ"></c:out>
								<option value="RN"><c:out value="RN"></c:out>
								<option value="RS"><c:out value="RS"></c:out>
								<option value="RO"><c:out value="RO"></c:out>
								<option value="RR"><c:out value="RR"></c:out>
								<option value="SC"><c:out value="SC"></c:out>
								<option value="SE"><c:out value="SE"></c:out>
								<option value="SP"><c:out value="SP"></c:out>
								<option value="TO"><c:out value="TO"></c:out>
							</select>
						</div>

						<div class="form-group col-xs-3">
							<label for="nome">CEP</label> <input type="text"
								class="form-control" name="cep" id="cep" placeholder="CEP">
						</div>


					</div>
					<!-- /.box-body -->
					<div class="box-body">
						<button type="submit" class="btn btn-primary">Cadastrar
							Fornecedor</button>
					</div>
				</form>
				<div class="box-body pull-right">
					<a href='<spring:url value="/fornecedores.html"></spring:url>'>
						<button class="btn btn-primary">Cancelar</button>
					</a>
				</div>
			</div>
			<!-- /.box -->
		</div>
		<!-- /. col-md-6 -->
		<!-- /.row -->
	</section>
</div>

<!-- /.content -->

<!-- /.content-wrapper -->