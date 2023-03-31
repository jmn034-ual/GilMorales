import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

@customElement('vista-ver-comentarios-comercial')
export class VistaVerComentariosComercial extends LitElement {
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
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="vaadinVerticalLayout">
 <vaadin-horizontal-layout theme="spacing" id="layoutCabecera" style="align-self: stretch;"></vaadin-horizontal-layout>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="align-self: stretch; flex-grow: 1; margin: var(--lumo-space-xs);">
  <vaadin-vertical-layout theme="spacing" id="layoutInfo">
   <vaadin-horizontal-layout theme="spacing" id="layoutpropietario" style="align-self: center;">
    <vaadin-vertical-layout theme="spacing" id="layoutFotoPerfil"></vaadin-vertical-layout>
    <vaadin-vertical-layout id="vaadinVerticalLayout1">
     <vaadin-button theme="tertiary" id="botonNombreUsuario">
       NombreUsuario 
     </vaadin-button>
     <label id="labelGeolocalizacion">Geolocalización</label>
    </vaadin-vertical-layout>
   </vaadin-horizontal-layout>
   <label id="labelDescripcion" style="align-self: stretch; flex-grow: 0; height: 20%;">Descripción de la publicación...</label>
   <vaadin-vertical-layout theme="spacing" id="layoutEstadisticas" style="align-self: flex-start; flex-grow: 0; justify-content: flex-start; align-items: flex-start;">
    <vaadin-horizontal-layout theme="spacing" id="layoutMeGustas" style="align-self: stretch;">
     <label id="numMeGustas" style="align-self: center;">0</label>
     <vaadin-button id="botonMeGusta">
       Me Gusta 
     </vaadin-button>
     <label id="labelNumMeGustas" style="align-self: center;">Numero Me Gustas</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="layoutNumComentarios">
     <label id="numComentarios" style="align-self: center;">0</label>
     <label id="labelComentarios">Numero Comentaios</label>
    </vaadin-horizontal-layout>
    <vaadin-horizontal-layout theme="spacing" style="align-self: stretch;" id="layoutVisualizaciones">
     <label id="numVisualizaciones" style="align-self: center;">0</label>
     <label id="labelVisualizaciones">Numero Visualizaciones</label>
    </vaadin-horizontal-layout>
   </vaadin-vertical-layout>
  </vaadin-vertical-layout>
  <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1;">
   <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="align-self: stretch; flex-grow: 1;"></vaadin-vertical-layout>
  </vaadin-vertical-layout>
 </vaadin-horizontal-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
