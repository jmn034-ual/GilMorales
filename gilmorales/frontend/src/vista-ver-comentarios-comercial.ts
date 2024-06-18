import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-avatar/src/vaadin-avatar.js';

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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="lex-grow: 1; height: 100%; width: 100%; z-index: 999; justify-content: center; padding-right: var(--lumo-space-m);" theme="spacing">
 <vaadin-vertical-layout theme="spacing" id="layoutInfo" style="flex-shrink: 0; width: 20%; height: 99%; align-items: center; padding-top: var(--lumo-space-xl);">
  <vaadin-horizontal-layout theme="spacing" id="layoutpropietario" style="align-self: center;">
   <vaadin-vertical-layout theme="spacing" id="layoutFotoPerfil">
    <vaadin-avatar id="vaadinAvatar" style="width: 100px; height: 100px;"></vaadin-avatar>
   </vaadin-vertical-layout>
   <vaadin-vertical-layout id="vaadinVerticalLayout1">
    <vaadin-button theme="tertiary" id="botonNombreUsuario">
      NombreUsuario 
    </vaadin-button>
    <label id="labelGeolocalizacion">Geolocalización</label>
   </vaadin-vertical-layout>
  </vaadin-horizontal-layout>
  <label id="labelDescripcion" style="flex-grow: 0;">Descripción de la publicación...</label>
  <vaadin-vertical-layout theme="spacing" id="layoutEstadisticas" style="align-self: center; flex-grow: 0; justify-content: center; align-items: flex-start; flex-shrink: 0; width: 100%;">
   <vaadin-horizontal-layout theme="spacing" id="layoutMeGustas" style="margin-left: var(--lumo-space-xl);">
    <label id="numMeGustas" style="align-self: center;">0</label>
    <vaadin-button id="botonMeGusta">
      Me Gusta 
    </vaadin-button>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);" id="layoutNumComentarios">
    <label id="numComentarios" style="align-self: center;">0</label>
    <label id="labelComentarios">Numero Comentaios</label>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing" style="margin-left: var(--lumo-space-xl);" id="layoutVisualizaciones">
    <label id="numVisualizaciones" style="align-self: center;">0</label>
    <label id="labelVisualizaciones">Numero Visualizaciones</label>
   </vaadin-horizontal-layout>
  </vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <hr style="height: 98%; z-index: 999; padding: 1px;" id="hr">
 <vaadin-vertical-layout theme="spacing" id="vaadinVerticalLayout2" style="flex-grow: 1; flex-shrink: 0; height: 95%; justify-content: flex-start;">
  <vaadin-vertical-layout theme="spacing" id="layoutListaComentarios" style="flex-grow: 0; width: 100%; flex-shrink: 0; padding-top: var(--lumo-space-l); align-self: stretch;"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
