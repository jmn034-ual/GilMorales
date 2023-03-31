import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-field.js';
import '@vaadin/vaadin-text-field/src/vaadin-text-area.js';

@customElement('vista-editar-perfil')
export class VistaEditarPerfil extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

  render() {
    return html`
<vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout" style="width: 100%; height: 100%; justify-content: center;">
 <vaadin-vertical-layout style="flex-grow: 0; width: 60%; align-self: center;" id="layoutEditarPerfil" theme="spacing">
  <vaadin-horizontal-layout theme="spacing" id="layoutTitulo" style="align-self: stretch; justify-content: center;">
   <h2 id="titulo">Editar Perfil</h2>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutFoto" style="align-self: stretch; justify-content: flex-start;">
   <vaadin-horizontal-layout theme="spacing" id="vaadinHorizontalLayout" style="flex-grow: 0; width: 50%; justify-content: flex-end;">
    <label id="labelFoto" style="align-self: center;">Foto de perfil:</label>
   </vaadin-horizontal-layout>
   <vaadin-vertical-layout theme="spacing" id="layoutImagen"></vaadin-vertical-layout>
   <vaadin-button id="botonCambiar" style="align-self: center;">
    Cambiar
   </vaadin-button>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" id="layoutNombreUsuario" style="align-self: stretch; justify-content: flex-start;">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 50%; justify-content: flex-end;" id="vaadinHorizontalLayout1">
    <label style="align-self: center;" id="labelNombreUsuario">Nombre de Usuario:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="NombreUsuario" id="textFieldNombreUsuario" style="align-self: center;"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-start;" id="layoutNombre">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 50%; justify-content: flex-end;" id="vaadinHorizontalLayout2">
    <label style="align-self: center;" id="labelNombre">Nombre:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-field placeholder="Nombre" style="align-self: center;" id="textFieldNombre"></vaadin-text-field>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing" style="align-self: stretch; justify-content: flex-start;" id="vaadinHorizontalLayout3">
   <vaadin-horizontal-layout theme="spacing" style="flex-grow: 0; width: 50%; justify-content: flex-end;" id="vaadinHorizontalLayout4">
    <label style="align-self: center;" id="labelDecripcion">Descripción corta:</label>
   </vaadin-horizontal-layout>
   <vaadin-text-area id="textAreaDescripcion" style="height: 100%;"></vaadin-text-area>
  </vaadin-horizontal-layout>
  <vaadin-horizontal-layout theme="spacing-xl" id="vaadinHorizontalLayout5" style="justify-content: center; margin: var(--lumo-space-m); align-self: flex-end;">
   <vaadin-button id="botonCancelar">
    Cancelar
   </vaadin-button>
   <vaadin-button id="botonGuardar">
    Guardar
   </vaadin-button>
  </vaadin-horizontal-layout>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
